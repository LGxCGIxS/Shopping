import javax.swing.*;

public class Java
{
  public static void main(String[] args)
  throws NumberFormatException
  {
    /*double[] prices =
    {
      12.99, //APPLES
      9.99, //CHOCOLATE BAR
      10.99, //ORANGES
      11.99, //WATER BOTTLE
      14.99 //ITUNES CARD
    };*/
    int[] items =
    {
      3, //AMOUNT OF APPLES
      3, //AMOUNT OF CHOCOLATE BARS
      3, //AMOUNT OF ORANGES
      3, //AMOUNT OF WATER BOTTLES
      3 //AMOUNT OF ITUNES CARDS
    };
    //double tax = 0.01;
    String storeName = "SekkoStore";
    System.out.println("Welcome to " + storeName + "!");
    System.out.println("We have a special menu on today!");
    String getMenuResponse = JOptionPane.showInputDialog("Do you want to see the menu?");
    if (getMenuResponse.equals("Yes"))
    {
      System.out.println("Alright! Glad to here that you are into our menu.");
      System.out.println("First, we need to know how much money you have silly!");
      String getMoneyResponse = JOptionPane.showInputDialog("How much money do you have?");
      double userMoney = 0.00;
      try
      {
        userMoney = Double.parseDouble(getMoneyResponse);
      }
      catch (NumberFormatException x)
      {
        System.out.println("Sorry, that isn't valid money. Try again.");
        String getMoneyTryTwo = JOptionPane.showInputDialog("How much money do you have?");
        try
        {
          userMoney = Double.parseDouble(getMoneyTryTwo);
        }
        catch (NumberFormatException y)
        {
          System.out.println("Sorry, we don't know if your a robot or not.\nPlease restart the program.");
          System.exit(0);
        }
      }
      String outputMoney = String.format("So you have $%.2f", userMoney);
      System.out.println(outputMoney);
      String valid = JOptionPane.showInputDialog("Is this correct?");
      if (userMoney >= 0.00 && userMoney <= 9.99)
      {
        System.out.println("Come back later. The amount of money you have won't pay for anything here. Sorry!");
        System.exit(0);
      }
      if (valid.equals("Yes"))
      {
        System.out.println("Okay. Here is our menu: ");
        System.out.println("Apples\nChocolate Bars\nOranges\nWater Bottles\niTunes Cards");
        String buyItemOne = JOptionPane.showInputDialog("What would you like to buy?");
        String[] cart =
        {
          "",
          "",
          "",
          "",
          ""
        };
        if (buyItemOne.equals("Apples") || buyItemOne.equals("Chocolate Bar") || buyItemOne.equals("Orange") || buyItemOne.equals("Water Bottle") || buyItemOne.equals("iTunes Card"))
        {
          System.out.println("Okay.");
          System.out.println("There are currently:");
          System.out.println(items[0] + " Apples");
          System.out.println(items[1] + " Chocolate Bars");
          System.out.println(items[2] + " Oranges");
          System.out.println(items[3] + " Water Bottles");
          System.out.println(items[4] + " iTunes Cards");
          String howMuchStuffOne = JOptionPane.showInputDialog("How much do you want?");
          int howMuch1 = 0;
          try
          {
            howMuch1 = Integer.parseInt(howMuchStuffOne);
          }
          catch (NumberFormatException a)
          {
            System.out.println("Sorry, thats not a number. Try again.");
            String tryHowMuchOneAgain = JOptionPane.showInputDialog("How much do you want?");
            try
            {
              howMuch1 = Integer.parseInt(tryHowMuchOneAgain);
            }
            catch (NumberFormatException b)
            {
              System.out.println("Error. Please restart the program. Thank you!");
              System.exit(0);
            }
          }
          if (buyItemOne.equals("Apples") && howMuch1 == 1)
          {
            cart[0] = "12.99";
            items[0] = 2;
          }
          else if (buyItemOne.equals("Apples") && howMuch1 == 2)
          {
            cart[0] = "25.99";
            items[0] = 1;
          }
          else if (buyItemOne.equals("Apples") && howMuch1 == 3)
          {
            cart[0] = "38.97";
            items[0] = 0;
          }
          else if (buyItemOne.equals("Apples") && howMuch1 >= 4)
          {
            System.out.println("Sorry we only have 3 apples. Please restart and try again.");
            System.exit(0);
          }
          if (buyItemOne.equals("Chocolate Bar") && howMuch1 == 1)
          {
            cart[1] = "9.99";
            items[1] = 2;
          }
          else if (buyItemOne.equals("Chocolate Bar") && howMuch1 == 2)
          {
            cart[1] = "19.98";
            items[1] = 1;
          }
          else if (buyItemOne.equals("Chocolate Bar") && howMuch1 == 3)
          {
            cart[1] = "29.97";
            items[1] = 0;
          }
          else if (buyItemOne.equals("Chocolate Bar") && howMuch1 >= 4)
          {
            System.out.println("Sorry we only have 3 Chocolate Bars. Please restart and try again.");
            System.exit(0);
          }
          if (buyItemOne.equals("Orange") && howMuch1 == 1)
          {
            cart[2] = "10.99";
            items[2] = 2;
          }
          else if (buyItemOne.equals("Orange") && howMuch1 == 2)
          {
            cart[2] = "21.98";
            items[2] = 1;
          }
          else if (buyItemOne.equals("Orange") && howMuch1 == 3)
          {
            cart[2] = "32.97";
            items[2] = 0;
          }
          else if (buyItemOne.equals("Orange") && howMuch1 >= 4)
          {
            System.out.println("Sorry we only have 3 Oranges. Please restart and try again.");
            System.exit(0);
          }
          if (buyItemOne.equals("Water Bottle") && howMuch1 == 1)
          {
            cart[3] = "11.99";
            items[3] = 2;
          }
          else if (buyItemOne.equals("Water Bottle") && howMuch1 == 2)
          {
            cart[3] = "23.98";
            items[3] = 1;
          }
          else if (buyItemOne.equals("Water Bottle") && howMuch1 == 3)
          {
            cart[3] = "35.97";
            items[3] = 0;
          }
          else if (buyItemOne.equals("Water Bottle") && howMuch1 >= 4)
          {
            System.out.println("Sorry we only have 3 Water Bottles. Please restart and try again.");
            System.exit(0);
          }
          if (buyItemOne.equals("iTunes Card") && howMuch1 == 1)
          {
            cart[4] = "14.99";
            items[4] = 2;
          }
          else if (buyItemOne.equals("iTunes Card") && howMuch1 == 2)
          {
            cart[4] = "29.98";
            items[4] = 1;
          }
          else if (buyItemOne.equals("iTunes Card") && howMuch1 == 3)
          {
            cart[4] = "44.97";
            items[4] = 0;
          }
          else if (buyItemOne.equals("iTunes Card") && howMuch1 >= 4)
          {
            System.out.println("Sorry we only have 3 iTunes Cards. Please restart and try again.");
            System.exit(0);
          }
          if (cart[0] == "12.99" && userMoney <= 12.99 && buyItemOne.equals("Apples"))
          {
            System.out.println("You don't have enough money for that!");
            System.exit(0);
          }
          else if (cart[0] == "12.99" && userMoney >= 13.00 && buyItemOne.equals("Apples"))
          {
            System.out.println("Okay! You have 1 Apple.");
            userMoney = userMoney - 13.00;
            String more = JOptionPane.showInputDialog("Anything else?");
            if (more.equals("Yes"))
            {
              System.out.println("Okay great! I'm happy that you want more.");
              if (userMoney < 10.00)
              {
                System.out.println("You have bought that one apple, and that's all you can buy.");
                System.out.println("But you don't have enough money for anything else!\nPlease get more and come back again!");
                System.exit(0);
              }
              String evenMore = JOptionPane.showInputDialog("What else do you want to buy?");
            }
            else if (more.equals("No"))
            {
              userMoney = userMoney - 13.00;
              String moneyFormat = String.format("Your money is now: $%.2f", userMoney);
              System.out.println(moneyFormat);
              System.out.println("Thanks for shopping at SekkoStore!\nCome back again!");
            }
          }
          if (cart[1] == "9.99" && userMoney <= 10.00 && buyItemOne.equals("Chocolate Bar"))
          {
            System.out.println("You don't have enough money for that!");
            System.exit(0);
          }
          else if (cart[1] == "9.99" && userMoney >= 10.00 && buyItemOne.equals("Chocolate Bar"))
          {
            System.out.println("Okay! You have 1 Chocolate Bar.");
            userMoney = userMoney - 10.00;
            String anythingMore = JOptionPane.showInputDialog("Anything else?");
            if (anythingMore.equals("Yes"))
            {
              System.out.println("Okay great! I'm happy that you want more.");
              if (userMoney < 10.00)
              {
                System.out.println("You have bought 1 Chocolate Bar.");
                System.out.println("You don't have enough money to buy another item!\nPlease come back again!");
                System.exit(0);
              }
              String moreFoodPlease = JOptionPane.showInputDialog("What else do you want to buy?");
            }
          }
          else if (cart[1] == "19.98" && userMoney >= 20.00 && buyItemOne.equals("Chocolate Bar"))
          {
            System.out.println("Okay! You have 2 Chocolate Bars.");
            userMoney = userMoney - 19.99;
            String someMoreThings = JOptionPane.showInputDialog("Anything else?");
            if (someMoreThings.equals("Yes"))
            {
              System.out.println("Okay great! I'm happy that you want more.");
              if (userMoney < 10.00)
              {
                System.out.println("You have bought 2 Chocolate Bars.");
                System.out.println("You don't have enough to buy another item!\nPlease come back again!");
              }
              String iWantMore = JOptionPane.showInputDialog("What else do you want to buy?");
            }
          }
          else if (cart[1] == "29.97" && userMoney >= 29.99 && buyItemOne.equals("Chocolate Bar"))
          {
            System.out.println("Okay! You have 3 Chocolate Bars.");
            userMoney = userMoney - 29.98;
            String askingForMore = JOptionPane.showInputDialog("Anything else?");
            if (askingForMore.equals("Yes"))
            {
              System.out.println("Okay great! I'm happy that you want more!");
              if (userMoney < 10.00)
              {
                System.out.println("You have bought 3 Chocolate Bars.");
                System.out.println("You don't have enough money anymore!\nPlease come back again!");
                System.exit(0);
              }
              String getMoreItems = JOptionPane.showInputDialog("What else do you want to buy?");
            }
          }
          if (cart[2] == "10.99" && userMoney >= 11.01 && buyItemOne.equals("Orange"))
          {
            System.out.println("Okay! You have 1 Orange.");
            userMoney = userMoney - 11.00;
            String iReallyWantMore = JOptionPane.showInputDialog("Anything else?");
            if (iReallyWantMore.equals("Yes"))
            {
              System.out.println("Okay great! I'm happy you want more!");
              if (userMoney < 10.00)
              {
                System.out.println("You bought 1 Orange.");
                System.out.println("You don't have enough money!\nPlease come back again!");
              }
              String moneyWantsMore = JOptionPane.showInputDialog("What else do you want to buy?");
            }
          }
          else if (cart[2] == "21.98" && userMoney >= 22.00 && buyItemOne.equals("Orange"))
          {
            System.out.println("Okay! You have 2 Oranges.");
            userMoney = userMoney - 21.99;
            String comeBackMore = JOptionPane.showInputDialog("Anything else?");
            if (comeBackMore.equals("Yes"))
            {
              System.out.println("Okay great! I'm happy you want more!");
              if (userMoney < 10.00)
              {
                System.out.println("You bought 2 Oranges.");
                System.out.println("You don't have enough money for anything else!\nPlease come back again!");
                System.exit(0);
              }
              String consumerChoice = JOptionPane.showInputDialog("What else do you want to buy?");
            }
          }
          else if (cart[2] == "32.97" && userMoney >= 32.99 && buyItemOne.equals("Orange"))
          {
            System.out.println("Okay! You have 3 Oranges.");
            userMoney = userMoney - 32.98;
            String iiMoreii = JOptionPane.showInputDialog("Anything else?");
            if (iiMoreii.equals("Yes"))
            {
              System.out.println("Okay great! I'm happy you want more!");
              if (userMoney < 10.00)
              {
                System.out.println("You bought 3 Oranges.");
                System.out.println("You don't have enough money now!\nPlease come back again!");
                System.exit(0);
              }
              String gettingMore4 = JOptionPane.showInputDialog("What else do you want to buy?");
            }
          }
          if (cart[3] == "11.99" && userMoney >= 12.01 && buyItemOne.equals("Water Bottle"))
          {
            System.out.println("Okay! You have 1 Water Bottle.");
            userMoney = userMoney - 12.00;
            String ohMoreFood = JOptionPane.showInputDialog("Anything else?");
            if (ohMoreFood.equals("Yes"))
            {
              System.out.println("Okay great! I'm happy you want more!");
              if (userMoney < 10.00)
              {
                System.out.println("You bought 1 Water Bottle.");
                System.out.println("You don't have money anymore!\nPlease come back again!");
                System.exit(0);
              }
              String iCantHelpIt = JOptionPane.showInputDialog("What else do you want to buy?");
            }
          }
          
        }
      }
      else if (valid.equals("No"))
      {
        System.out.println("Why are you lying to me? I don't support liars!");
        System.exit(0);
      }
    }
    else if (getMenuResponse.equals("No"))
    {
      System.out.println("Oh, okay. Well have fun at another store!");
      System.exit(0);
    }
    System.exit(0);
  }
}