package lsps.before;

public class Whatsapp extends SocialMedia
{
    public void chatWithFriend()
    {
        System.out.println("This feature allow");
    }

    public void publishPost(Object post)
    {
        System.out.println("This feature Not allowed");        //not obey LiskovSubstitution Principle
    }

    public void sendPhotosAndVideos()
    {
        System.out.println("This feature allow");
    }

    public void groupVideoCall(String... users) {
        System.out.println("This feature allow");
    }
}
