import java.util.Scanner;

class Spotify2

{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("**********Spotify Welcome you**********");
System.out.println("***********************************");
System.out.println("SELECT YOUR OPTION , LIKE THIS!!!! ");
System.out.println("1. A.R.RAHMAN");
System.out.println("2. ANIRUDH");
System.out.println("3.HARISH JEYARAJ");
System.out.println("4.ILLAIYA RAJA");
System.out.println("5.U1");

System.out.print("SELECT YOUR FAVOURITE SINGER !!! ");
int singer=sc.nextInt();

int song;

if(singer==1)
{
System.out.println("A.R.RAHMAN SONGS:");
System.out.println("1. MELODY");
System.out.println("2. KUTHU");
System.out.println("3. MOTIVATIONAL");
System.out.println("4. SAD");

System.out.print("SELECT YOUR SONG TYPE: ");
song=sc.nextInt();

if(song==1)
{
System.out.println("MELODY SONGS:");
System.out.println("Netru Illadha Matram");
System.out.println("Enna Solla Pogirai");
System.out.println("Ennavale Adi Ennavale");
System.out.println("Malargale Malargale");
}
else if(song==2)
{
System.out.println("KUTHU SONGS:");
System.out.println("Thaiya Thaiya");
System.out.println("Mukkala Mukkabala");
System.out.println("Urvashi Urvashi");
System.out.println("Aathichudi");
}
else if(song==3)
{
System.out.println("MOTIVATIONAL SONGS:");
System.out.println("Vande Mataram");
System.out.println("Oruvan Oruvan Mudhalali");
System.out.println("Shakthi Kodu");
System.out.println("Kappal Yeri Poyachu");
}
else if(song==4)
{
System.out.println("SAD SONGS:");
System.out.println("Marudaani");
System.out.println("Minnale En Vazhvin");
System.out.println("Rasathi");
System.out.println("Oru Poiyavathu Sol");
}
}

else if(singer==2)
{
System.out.println("ANIRUDH SONGS:");
System.out.println("1. MELODY");
System.out.println("2. KUTHU");
System.out.println("3. MOTIVATIONAL");
System.out.println("4. SAD");

System.out.print("SELECT YOUR SONG TYPE: ");
song=sc.nextInt();

if(song==1)
{
System.out.println("MELODY SONGS:");
System.out.println("Neeyum Nanum Anbe");
System.out.println("Velicha Poove");
System.out.println("Po Indru Neeyaga");
System.out.println("Nee Partha Vizhigal");
}
else if(song==2)
{
System.out.println("KUTHU SONGS:");
System.out.println("Vaathi Raid");
System.out.println("Naa Ready");
System.out.println("Badass");
System.out.println("Vandha Edam");
}
else if(song==3)
{
System.out.println("MOTIVATIONAL SONGS:");
System.out.println("Velai Illa Pattathari");
System.out.println("Boomi Enna Suthudhe");
System.out.println("Ethir Neechal");
System.out.println("Surviva");
}
else if(song==4)
{
System.out.println("SAD SONGS:");
System.out.println("Porkanda Singam");
System.out.println("Kanave Kanave");
System.out.println("Kannaana Kanne");
System.out.println("Jodi Nilave");
}
}

}
}