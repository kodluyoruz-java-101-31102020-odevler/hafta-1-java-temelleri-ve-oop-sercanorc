package kodluyoruz.soru7.Report;

import java.util.Date;

public class Report {

    String name="";
    String result="";
    Date createDate;

    public String getName() {
        return name;
    }

    public String getResult() {
        return result;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
