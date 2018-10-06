// Install the Java helper library from twilio.com/docs/libraries/java
import java.util.*;

import com.twilio.sdk.*;
import com.twilio.sdk.resource.factory.*;
import com.twilio.sdk.resource.instance.*;
import com.twilio.sdk.resource.list.*;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC1ba67ccf30ea2fe309901290ea6937e3";
    public static final String AUTH_TOKEN = "e1d0f772142d3e7acd08fd2ead3af7f7";

    public static void main(String[] args) {
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

        // Build the parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("To", "+16312526048"));
        params.add(new BasicNameValuePair("From", "+16312526048"));
        params.add(new BasicNameValuePair("Body", "Hello from Damina Townes CS 643 Fall 2018"));

        MessageFactory messageFactory = client.getAccount().getMessageFactory();
        Message message = messageFactory.create(params);

        System.out.println(message.getSid());
    }
}
