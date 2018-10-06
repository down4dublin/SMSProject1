import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSMS {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "AC1ba67ccf30ea2fe309901290ea6937e3";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message.creator(new PhoneNumber("+16312526048"),
        new PhoneNumber("+16312526048"), 
        "Hello from Damina Townes CS 643 Fall 2018").create();
    
    Message message1 = Message.creator(new PhoneNumber("+6312526048"),
            new PhoneNumber("+6312526048"), 
            "Hello from Damina Townes CS 643 Fall 2018").create();

    System.out.println(message.getSid());
  }
}
