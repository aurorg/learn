package message;

import java.io.File;

public class FriendChatmsg  extends Message{

    private int userid;//用户id

    private int friendid;//好友的id

    //来区分消息的类型
    private String messagetype;//Text代指文本消息、File代指文件消息

    private String message; //用户和好友之间进行交流的消息

    //用来区分聊天的类型，群聊消息，还是好有个人消息
    //Group好友消息,Friend群消息;chattype一般情况下为好友消息
    private String chattype;

    private File file;

    private int count =1;//未读消息的条数


    private String a; //加信息的

    private int Group=0;
    private int cishu;//记录发消息是第几次

    public  FriendChatmsg(){}

    public FriendChatmsg(int userid,int friendid,File file,String messagetype){
        this.userid=userid;
        this.friendid=friendid;
        this.file=file;
        this.messagetype=messagetype;
    }

    public  FriendChatmsg(int userid,int friendid,String message,String messagetype){
        this.userid=userid;
        this.friendid=friendid;
        this.message=message;
        this.messagetype=messagetype;

    }

    public void setCount(int count){
        this.count=count;
    }

    public void setMessage(String message){
        this.message=message;
    }

    public void setFile(File file){
        this.file=file;
    }

    public void setChattype(String chattype) {
        this.chattype = chattype;
    }

    public void setGroup(int group) {
        Group = group;
    }

//    public void setCishu(int cishu){
//        cishu=cishu;
//    }

    public String getChattype() {
        return chattype;
    }

    public int getGroup() {
        return Group;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public String getMessage(){
        return this.message;
    }
    public int getFriendid(){
        return this.friendid;
    }
    public int getUserid(){
        return this.userid;
    }

    public File getFile(){
        return file;
    }

    public int getCount(){
        return count;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    //    public int getCishu(){
//        return this.cishu;
//    }

    /*    @Override
        public int getMessageType() {
            return FriendChatRequestMessage;
        }*/
    public String toString(){
        return "userid = "+userid+", friendid = "+friendid+" message = "+message;
    }


}
