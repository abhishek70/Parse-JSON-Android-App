package abhishek.jsonapp;

import android.util.Log;

import org.json.JSONObject;

/**
 * Created by abhishek on 8/22/14.
 */
public class Contact {
    public String id;
    public String name;
    public String email;
    public String address;
    public String gender;
    public String phone;
    public String mobile;
    public String home;
    public String office;

    public static Contact fromJSON(JSONObject contactJson) throws Exception{

        Contact contact = new Contact();
        contact.id = contactJson.optString("id","");
        contact.name = contactJson.optString("name","");
        contact.email = contactJson.optString("email","");
        contact.address = contactJson.optString("address","");
        contact.gender = contactJson.optString("gender","");
        contact.phone = contactJson.optString("phone","");
        contact.mobile = contactJson.optString("mobile","");
        contact.home = contactJson.optString("home","");
        contact.office = contactJson.optString("office","");

        return contact;
    }
}
