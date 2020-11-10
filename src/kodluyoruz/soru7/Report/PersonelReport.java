package kodluyoruz.soru7.Report;

import java.security.MessageDigest;

public class PersonelReport extends Report {

    String hashMD5Result(String result) {
        String pass="";
        try {
            MessageDigest messageDigestNesnesi = MessageDigest.getInstance("MD5");
            messageDigestNesnesi.update(result.getBytes());
            byte messageDigestDizisi[] = messageDigestNesnesi.digest();
            StringBuffer sb16 = new StringBuffer();
            for (int i = 0; i < messageDigestDizisi.length; i++) {
                sb16.append(Integer.toString((messageDigestDizisi[i] & 0xff) + 0x100, 16).substring(1));
            }
            pass= sb16.toString();
        }
        catch(Exception ex){
                System.out.println(ex);
        }
        return pass;
    }
}
