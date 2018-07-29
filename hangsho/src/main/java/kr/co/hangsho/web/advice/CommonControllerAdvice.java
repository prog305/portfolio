package kr.co.hangsho.web.advice;

import java.util.Date;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import kr.co.hangsho.web.editor.DateEditor;

@ControllerAdvice
public class CommonControllerAdvice {
	
	@InitBinder
	public void binder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class , new DateEditor());
	}

}