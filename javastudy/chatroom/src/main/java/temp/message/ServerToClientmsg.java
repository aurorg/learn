package temp.message;

import message.Message;

import java.io.File;
import java.util.List;
import java.util.Map;

public class ServerToClientmsg extends Message {

    private boolean success;
    private String reason;
    private Map<String, List<String>> informationMap; //暂时的消息

    public List<String> friendmsglist;//好友历史消息列表
    public List<String> friendmsglist1;//好友未读消息列表
    public List<String> friendlist;    //好友列表信息


    public List<String> grouplist; //群成员列表
    public List<String> grouphistorymsg; //群历史消息
    public List<String> groupunreadmsg; //群的未读消息


    public String havefile="";
    public File file; //用来接受file
    private int readcount=0; //读消息的条数


    private int ServerToClientmsg;
    int MessageType=ServerToClientmsg;
    
    public ServerToClientmsg(){
        
    }
    public ServerToClientmsg(boolean success,String reason){
        this.success=success;
        this.reason=reason;
    }

    public void setMessageType(int MessageType){
        this.MessageType=MessageType;
    }


    public boolean getSuccess(){
        return this.success;
    }


    public String getReason(){
        return this.reason;
    }

    public int getMessageType() {
        return this.MessageType;
    }

    public void setHavefile(String havefile){
        this.havefile=havefile;
    }

    public String getHavefile(){
        return havefile;
    }

    public void setFile(File file){
        this.file=file;
    }

    public File getFile(){
        return file;
    }

    public void setReadcount(int readcount){
        this.readcount=readcount;
    }

    public  int getReadcount(){
        return readcount;
    }



    public void setInformationMap(Map<String,List<String>> informationMap){
        this.informationMap=informationMap;
    }

    public Map<String,List<String>> getInformationMap(){
        return informationMap;
    }
//——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
    public void setFriendmsglist(List<String> friendmsglist){
        this.friendmsglist=friendmsglist;
    }
    public List<String> getFriendmsglist(){
        return friendmsglist;
    }

//——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
    public void setFriendmsglist1(List<String> friendmsglist1){
        this.friendmsglist1=friendmsglist1;
    }
    public List<String> getFriendmsglist1(){
        return friendmsglist1;
    }
//————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
    public void setFriendlist(List<String> friendlist){
        this.friendlist=friendlist;
    }

    public List<String> getFriendlist(){
        return friendlist;
    }

//——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————

    public void setGrouplist(List<String> grouplist) {
        this.grouplist = grouplist;
    }

    public List<String> getGrouplist() {
        return grouplist;
    }

    //——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————

    public void setGrouphistorymsg(List<String> grouphistorymsg) {
        this.grouphistorymsg = grouphistorymsg;
    }

    public List<String> getGrouphistorymsg() {
        return grouphistorymsg;
    }

    //——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————

    public void setGroupunreadmsg(List<String> groupunreadmsg) {
        this.groupunreadmsg = groupunreadmsg;
    }

    public List<String> getGroupunreadmsg() {
        return groupunreadmsg;
    }
    //——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————




    public String toString(){
        return "是否成功 = "+success+", 原因 = "+reason;
    }
}
