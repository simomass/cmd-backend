package it.cmd.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"it.cmd.backend.controllers","it.cmd.backend.services",
		"it.cmd.backend.configuration"})
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		new SpringApplication(BackendApplication.class).run(args);
	}

	@Override
	public void run(String... args) throws ExitException {
		if(args.length>0 && args[0].equals("exitcode")){
			throw new ExitException();
		}
	}
	
	class ExitException extends RuntimeException implements ExitCodeGenerator {
		private static final long serialVersionUID = 1L;

		@Override
		public int getExitCode(){
			return 10;
		}
	}
}
