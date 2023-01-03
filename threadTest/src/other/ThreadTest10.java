//package other;
//
//import java.util.ArrayList;
//import java.util.Random;
//
///*
//   10마리의 말들이 경주하는 경마 프로그램 작성하기
//   
//   말은 Horse라는 이름의 쓰레드 클래스로 작성하는데 이 클래스는
//   말이름(String), 등수(int), 현재위치(int)를 멤버변수로 갖는다.
//   그리고 이 클래스는 등수를 오름차순으로 처리할 수 있는 내부 정렬 기준이 있다.
//   (Comparable인터페이스 구현)
//   
//   경기 구간은 1 ~ 50구간으로 되어있다.
//   
//   경기 중에는 중간 중간에 각 말들의 위치를 아래 예시와 같이 나타낸다.
//   
//   예시)
//   01번말 : ---->-----------------------------------------
//   02번말 : -->-------------------------------------------
//   ~~~
//   10번말 : -------->-------------------------------------
//   
//   
//   경기가 끝나면 등수의 오름차순으로 정렬하여 출력한다.
//   
//*/
//public class ThreadTest10 {
//   public static Horse2[] horses = new Horse2[10];
//   public static ArrayList<String> rank = new ArrayList<String>();
//   
//   
//   
//   public static void main(String[] args) {
//      for(int i = 0; i < horses.length; i++) {
//         horses[i] = new Horse2((i + 1) + "번말");
//      }
//      for(Horse2 horse : horses) {
//         horse.start();
//      }
//      HorseRank hs = new HorseRank();
//      hs.setDaemon(true);
//      hs.start();
//      
//      for(Horse2 horse : horses) {
//         try {
//            horse.join();
//         } catch (InterruptedException e) {}
//      }
//      System.out.println("\n경기 결과\n");
//      for(int i = 0; i < rank.size(); i++) {
//         System.out.printf("%2d등 : %4s\n", i + 1, rank.get(i));
//      }
//   }
//
//}
//
//// 말 랭킹
//class HorseRank extends Thread {
//   @Override
//   public void run() {
//      while(true) {
//         try {
//            Thread.sleep(100);
//            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//            
//            for(int i = 0; i < 10; i++) {
//               System.out.printf("%4s : ",ThreadTest10.horses[i].getHorseName());
//               for(int j = 0; j < ThreadTest10.horses[i].getPosition(); j++) {
//                  System.out.print("-");
//               }
//               System.out.print(">");
//               for(int j = ThreadTest10.horses[i].getPosition(); j < 50; j++) {
//                  System.out.print("-");
//               }
//               System.out.println();
//            }
//         } catch (InterruptedException e) {
//            // TODO: handle exception
//         }
//      }
//   }
//}
//
//// 말
//class Horse extends Thread implements Comparable<Horse2> {
//   private String horseName;
//   private int ranking;
//   private int position;
//   
//   
//   public Horse(String name) {
//      this.horseName = name;
//   }
//   
//   public String getHorseName() {
//      return horseName;
//   }
//
//   public void setHorseName(String horseName) {
//      this.horseName = horseName;
//   }
//
//   public int getRanking() {
//      return ranking;
//   }
//
//   public void setRanking(int ranking) {
//      this.ranking = ranking;
//   }
//
//   public int getPosition() {
//      return position;
//   }
//
//   public void setPosition(int position) {
//      this.position = position;
//   }
//
//   @Override
//   public void run() {
//      for(int i = 1; i <= 50; i++) {
//         try {
//            this.position = i;
//            Thread.sleep(new Random().nextInt(400));
//         } catch (InterruptedException e) {
//            // TODO: handle exception
//         }
//      }
//      ThreadTest10.rank.add(this.horseName);
//      
//   }
//   
//   @Override
//   public int compareTo(Horse2 horse) {
//      return this.ranking - horse.ranking;
//   }
//}