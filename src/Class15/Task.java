package Class15;

public class Task {
    /*
    Create a method createEmail(). Based on values of users name,
    lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */

    // return type is String
    // name of the method is createEmail
    // Parameter => String firstName, String lastName, String emailType
    //{
      //  concat
    //}

    String createEmail(String fristName, String lastName, String emailType){
        return fristName+lastName+"@"+emailType+".com";
    }
}
