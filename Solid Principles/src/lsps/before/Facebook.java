package lsps.before;

public class Facebook extends SocialMedia
{
    public void chatWithFriend()
    {
        System.out.println("Whatsapp supports chatting feature");
    }

    public void publishPost(Object post)
    {
        System.out.println("This feature is not supported");            //Not Applicable
    }

    public void sendPhotosAndVideos()
    {
        System.out.println("Whatsapp supports Send photos and videos feature");
    }

    public void groupVideoCall(String ...users)
    {
        System.out.println("Whatsapp supports Group video calls feature");
    }
}
