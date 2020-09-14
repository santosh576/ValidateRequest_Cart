package com.validation.ValidateRequest.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.ValidateRequest.ModelType.ShoppingCart;
import com.validation.ValidateRequest.ModelType.Validatecart;
import com.validation.ValidateRequest.ModelType.ValidationMessage;

@RestController
@RequestMapping("api/shopping")
public class ValidationController {
	
	@PostMapping("/addcart")
	public ValidationMessage acceptCartRequest(@RequestBody ShoppingCart payload)
	{
		ArrayList<String> message=new ArrayList<>();
		boolean ispresent;
		String catalougename=payload.getCatalogname();
		Validatecart validate=new Validatecart();
		ispresent=validate.validatecartrequest(catalougename);
		if(!(ispresent))
		{
			message.add("Not valid catalougeName");
		}
		return new ValidationMessage(message);
	}

}
