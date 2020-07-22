package org.wcci.apimastery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Populator implements CommandLineRunner {

    AlbumRepository albumRepo;
    ArtistRepository artistRepo;
    SongRepository songRepo;

    public Populator(AlbumRepository albumRepo, ArtistRepository artistRepo, SongRepository songRepo) {
        this.albumRepo = albumRepo;
        this.artistRepo = artistRepo;
        this.songRepo = songRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Artist ladyGaga = new Artist("Lady Gaga", "https://i.insider.com/5e14d0643b57e809c97a2913?width=600&format=jpeg&auto=webp", "American singer/songwriter, actress, and movie producer", "Pop", "Def Jam Recordings");
        Artist theWeeknd = new Artist("The Weeknd", "https://media.gq.com/photos/55d25378606992214f1ecc7d/16:9/w_2560%2Cc_limit/The-Weekend-GQ-2015-01.jpg", "Canadian singer/songwriter and record producer", "R&B", "XO");
        Artist beyonce = new Artist("Beyonce", "https://static.standard.co.uk/s3fs-public/thumbnails/image/2017/09/04/13/beyonce.jpg", "American singer-songwriter and actress who achieved fame in the late 1990s as the lead singer of Destiny's Child", "R&B", "Music World");
        Artist rihanna = new Artist("Rihanna","https://pbs.twimg.com/profile_images/1133109643734130688/BwioAwkz.jpg","Barbadian singer, songwriter, actress, and businesswoman","Pop", "Roc Nation");
        Artist justinTimberlake = new Artist("Justin Timberlake", "https://www.thesun.co.uk/wp-content/uploads/2018/02/nintchdbpict000382335058.jpg","American singer, songwriter, actor, and record producer","Pop","Tennman Records");

        artistRepo.save(ladyGaga);
        artistRepo.save(theWeeknd);
        artistRepo.save(beyonce);
        artistRepo.save(rihanna);
        artistRepo.save(justinTimberlake);

        Song justDance = new Song("Just Dance", "https://www.youtube.com/watch?v=2Abk1jAONjw", "4:02");
        Song pokerFace = new Song("Poker Face", "https://www.youtube.com/watch?v=bESGLojNYSo", "3:39");
        Song ehEh = new Song("Nothing Else I Can Say", "https://www.youtube.com/watch?v=mVEG793G3N4", "2:56");
        Song loveGame = new Song("Love Game", "https://www.youtube.com/watch?v=1mB0tP1I-14", "3:59");
        Song paparazzi = new Song("Paparazzi", "https://www.youtube.com/watch?v=d2smz_1L2_0", "3:30");

        songRepo.save(justDance);
        songRepo.save(pokerFace);
        songRepo.save(ehEh);
        songRepo.save(loveGame);
        songRepo.save(paparazzi);

        Song lonelyStar = new Song("Lonely Star", "https://www.youtube.com/watch?v=pdH1kXzquQo", "5:49");
        Song lifeOfTheParty = new Song("Life of the Party", "https://www.youtube.com/watch?v=_bSXY75R3Wc", "4;57");
        Song thursday1 = new Song("Thursday", "https://www.youtube.com/watch?v=0Suprl56Owg", "5:19");
        Song theZone = new Song("The Zone", "https://www.youtube.com/watch?v=tfrWuiQ4QNc", "6:50");
        Song theBirdsPart1 = new Song("The Birds Part One", "https://www.youtube.com/watch?v=t2_YyRBYZjM", "3:34" );
        Song theBirdsPart2 = new Song("The Birds Part Two", "https://www.youtube.com/watch?v=9FE-Pwm2cyc", "5:50");
        Song gone = new Song("Gone", "https://www.youtube.com/watch?v=CqHKfscXS64", "8:07");
        Song rollingStone = new Song("Rolling Stone", "https://www.youtube.com/watch?v=ORVz_qeKgvg", "3:50");
        Song heavenOrLA = new Song("Heaven or Las Vegas", "https://www.youtube.com/watch?v=dXbJ8-38yHw", "5:53");

        songRepo.save(lonelyStar);
        songRepo.save(lifeOfTheParty);
        songRepo.save(thursday1);
        songRepo.save(theZone);
        songRepo.save(theBirdsPart1);
        songRepo.save(theBirdsPart2);
        songRepo.save(gone);
        songRepo.save(rollingStone);
        songRepo.save(heavenOrLA);

        Song pray = new Song("Pray You Catch Me", "https://www.youtube.com/watch?v=170vgLFJW2Y", "3:15");
        Song holdUp = new Song("Hold Up", "https://www.youtube.com/watch?v=PeonBmeFR8o", "3:41");
        Song sorry = new Song("Sorry", "https://www.youtube.com/watch?v=QxsmWxxouIM", "3:52");
        Song sixInch = new Song("6 Inch", "https://www.youtube.com/watch?v=UKMmfBkrhtY", "4:20");
        Song daddyLessons = new Song("Daddy Lessons", "https://www.youtube.com/watch?v=6Mm9ae_qg9I", "4:42");
        Song loveDrought = new Song("Love Drought", "https://www.youtube.com/watch?v=mgCjiutEgrw", "3:57");
        Song sandCastles = new Song("Sandcastles", "https://www.youtube.com/watch?v=RD38JT8rypY", "3:02");
        Song forward = new Song("Forward", "https://www.youtube.com/watch?v=tPzCGZXULbQ", "1:19");
        Song freedom = new Song("Freedom", "https://www.youtube.com/watch?v=7FWF9375hUA", "4:49");
        Song allNight = new Song("All Night", "https://www.youtube.com/watch?v=gM89Q5Eng_M", "5:21");
        Song formation = new Song("Formation", "https://www.youtube.com/watch?v=WDZJPJV__bQ", "3:26");

        songRepo.save(pray);
        songRepo.save(holdUp);
        songRepo.save(sorry);
        songRepo.save(sixInch);
        songRepo.save(daddyLessons);
        songRepo.save(loveDrought);
        songRepo.save(sandCastles);
        songRepo.save(forward);
        songRepo.save(freedom);
        songRepo.save(allNight);
        songRepo.save(formation);

        Song phreshOutTheRunway = new Song("Phresh Out The Runway", "https://www.youtube.com/watch?v=-ly4NHauQHU", "3:42");
        Song diamonds = new Song("Diamonds", "https://www.youtube.com/watch?v=lWA2pjMjpBs", "3:45");
        Song numb = new Song("Numb", "https://www.youtube.com/watch?v=HVfoRzNLgUg", "3:25");
        Song pourItUp = new Song("Pour It Up", "https://www.youtube.com/watch?v=ehcVomMexkY", "2:41");
        Song loveSong = new Song("Loveeeeeee Song", "https://www.youtube.com/watch?v=SybwPySl-fs", "4:16");
        Song jump = new Song("Jump", "https://www.youtube.com/watch?v=B6OJonOj8r4", "4:24");
        Song rightNow = new Song("Right Now", "https://www.youtube.com/watch?v=Kvz9eMJL6jM", "3:01");
        Song whatNow = new Song("What Now", "https://www.youtube.com/watch?v=b-3BI9AspYc", "4:03");
        Song stay = new Song("Stay", "https://www.youtube.com/watch?v=JF8BRvqGCNs", "4:00");
        Song nobodysBusiness = new Song("Nobody's Business", "https://www.youtube.com/watch?v=H4sICbJsqFI", "3:36");
        Song loveWithoutTragedy = new Song("Love Without Tragedy", "https://www.youtube.com/watch?v=-bCeiiFAWtg", "6:58");
        Song getItOverWith = new Song("Get It Over With", "https://www.youtube.com/watch?v=kwd5fiS4G_o", "3:31");
        Song noLoveAllowed = new Song("No Love Allowed", "https://www.youtube.com/watch?v=ZcyhCXpg97s", "4:09");
        Song lostInParadise = new Song("Lost In Paradise", "https://www.youtube.com/watch?v=d5vQtb3goI8", "3:35");

        songRepo.save(phreshOutTheRunway);
        songRepo.save(diamonds);
        songRepo.save(numb);
        songRepo.save(pourItUp);
        songRepo.save(loveSong);
        songRepo.save(jump);
        songRepo.save(rightNow);
        songRepo.save(whatNow);
        songRepo.save(stay);
        songRepo.save(nobodysBusiness);
        songRepo.save(loveWithoutTragedy);
        songRepo.save(getItOverWith);
        songRepo.save(noLoveAllowed);
        songRepo.save(lostInParadise);

        Song pusherLoveGirl = new Song("Pusher Love Girl", "https://www.youtube.com/watch?v=P8mNfNQOm0A", "8:02");
        Song suitAndTie = new Song("Suit And Tie", "https://www.youtube.com/watch?v=IsUsVbTj2AY", "5:26");
        Song dontHoldTheWall = new Song("Don't Hold The Wall", "https://www.youtube.com/watch?v=MWd4BJRExNw", "7:10");
        Song strawberryBubblegum = new Song("Strawberry Bubblegum", "https://www.youtube.com/watch?v=OsbnozwyWXo", "7:59");
        Song tunnelVision = new Song("Tunnel Vision", "https://www.youtube.com/watch?v=07FYdnEawAQ", "6:46");
        Song spaceshipCoupe = new Song("Spaceship Coupe", "https://www.youtube.com/watch?v=gqqTxDBK_XA", "7:17");
        Song thatGirl = new Song("That Girl", "https://www.youtube.com/watch?v=Q0lnciapJjk", "4:47");
        Song letTheGrooveGetIn = new Song("Let The Groove Get In", "https://www.youtube.com/watch?v=KHsrWuYomiI", "7:11");
        Song mirrors = new Song("Mirrors", "https://www.youtube.com/watch?v=uuZE_IRwLNI", "8:05");
        Song blueOceanFloor = new Song("Blue Ocean Floor", "https://www.youtube.com/watch?v=K5oAf7bs7_U", "7:19");

        songRepo.save(pusherLoveGirl);
        songRepo.save(suitAndTie);
        songRepo.save(dontHoldTheWall);
        songRepo.save(strawberryBubblegum);
        songRepo.save(tunnelVision);
        songRepo.save(spaceshipCoupe);
        songRepo.save(thatGirl);
        songRepo.save(letTheGrooveGetIn);
        songRepo.save(mirrors);
        songRepo.save(blueOceanFloor);

        Album theFame = new Album("The Fame", "Streamline", "https://static.keymusic.com/products/119000/340/hal-leonard-lady-gaga-the-fame-monster.jpg", ladyGaga, justDance, pokerFace, ehEh, loveGame, paparazzi);
        Album thursday = new Album("Thursday", "XO", "https://upload.wikimedia.org/wikipedia/en/d/dd/The_Weeknd_-_Thursday.png", theWeeknd, lonelyStar, lifeOfTheParty, thursday1,
                theZone, theBirdsPart1, theBirdsPart2, gone, rollingStone, heavenOrLA);
        Album lemonade = new Album("Lemonade", "Parkwood Entertainment", "https://upload.wikimedia.org/wikipedia/en/5/53/Beyonce_-_Lemonade_%28Official_Album_Cover%29.png", beyonce,
                pray, holdUp, sorry, sixInch, daddyLessons, loveDrought, sandCastles, forward, freedom, allNight, formation);
        Album unapologetic = new Album("Unapologetic","Roc Nation","https://23u0pr24qn4zn4d4qinlmyh8-wpengine.netdna-ssl.com/wp-content/uploads/2016/07/rhi_12_original_19979.jpg",
                rihanna,phreshOutTheRunway,diamonds,numb,pourItUp,loveSong,jump,rightNow,whatNow,stay,nobodysBusiness,loveWithoutTragedy,getItOverWith,noLoveAllowed,lostInParadise);
        Album twentyTwenty = new Album("The 20/20 Experience","Tennman Records","https://static.billboard.com/files/media/justin-timberlake-20-20-experience-650-430-compressed.jpg",
                justinTimberlake,pusherLoveGirl,suitAndTie,dontHoldTheWall,strawberryBubblegum,tunnelVision,spaceshipCoupe,thatGirl,letTheGrooveGetIn,mirrors,blueOceanFloor);

        albumRepo.save(theFame);
        albumRepo.save(thursday);
        albumRepo.save(lemonade);
        albumRepo.save(unapologetic);
        albumRepo.save(twentyTwenty);

    }
}
