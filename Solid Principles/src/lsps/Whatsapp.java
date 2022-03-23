package lsps;

public class Whatsapp implements SocialMedia,VideoCallManager
{

    @Override
    public void chatWithFriend()
    {
        System.out.println("Whatsapp allows to chat with friends features");
    }

    @Override
    public void sendPhotosAndVideos()
    {
        System.out.println("Whatsapp allows sendPotosAndVideos features");
    }

    @Override
    public void groupVideoCall(String... users)
    {
        System.out.println("Whatsapp allows to chat with friends features");
    }
}
