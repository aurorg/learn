package message;

public class GroupQuitMessage extends Message{

    int userid;
    int groupid;
    String message;

    public GroupQuitMessage(int userid, int groupid, String message){
        this.userid=userid;
        this.groupid=groupid;
        this.message=message;
    }
    //——————————————————————————————————————————————————————————————————————
    public void setUserid(int userid){
        this.userid=userid;
    }

    public int getUserid(){
        return userid;
    }
    //——————————————————————————————————————————————————————————————————————
    public void setGroupid(int groupid){
        this.groupid=groupid;
    }

    public int getGroupid(){
        return groupid;
    }
//———————————————————————————————————————————————————————————————————————

    public void setMessage(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
//————————————————————————————————————————————————————————————————————————


    @Override
    public String toString() {
        return "退群的消息GroupQuitMessage{" + "userid=" + userid + ", groupid=" + groupid + ", message='" + message + '\'' + '}';
    }
}
