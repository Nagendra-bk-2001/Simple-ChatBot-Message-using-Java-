package com.ChatBot;

import java.util.*;
public class ChatBot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hello!! I'm Your ChatBot.  Type 'quite' to exit . ");
		
		while(true)
		{
			System.out.print("You: ");
			
			String input = sc.nextLine();
			
			if(input.equalsIgnoreCase("quit")) 
					{
						break;
					}
			System.out.println("Bot: " + respond(input));
		}

	}
	
	static String respond(String input)
	{
		if(input.contains("hello") || input.contains("hi"))
		{
			return "Hello!!";
		}
		else if(input.contains("how are you"))
		{
			return " I'm doing well, Thanks!";
		}
		else if(input.contains("What is your name?"))
		{
			return " My name is ChatBot";
		}
		else
		{
			return "I didn't understand that.";
		}
	}

}
