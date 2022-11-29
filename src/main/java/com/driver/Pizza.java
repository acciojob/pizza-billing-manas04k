package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price+=300;

        }
        else{
            price+=400;
        }

    }

    public int getPrice(){
        return this.price;
    }

    boolean flag1 = true;
    public void addExtraCheese(){
        // your code goes here
        if(flag1){
            this.price += 80;

//            if(flag1 && !flag2){
//
//                bill+="Extra Cheese Added: 80 \n";
//                bill+="Extra Toppings Added: 70 \n";
//
//            }
//            else{
//
//            }
            flag1 = false;
        }


    }

    boolean flag2 = true;
    public void addExtraToppings(){
        // your code goes here
        if(flag2){
            if(this.isVeg){
                this.price+=70;
//                if(!flag1){
//                    bill+="Extra Cheese Added: 80 \n" ;
//                    bill+="Extra Toppings Added: 70 \n";
//                    System.out.println("Done");
//
//                }


            }
            else{
                this.price+=120;
//                if(!flag1){
//                    bill+="Extra Cheese Added: 80 \n" ;
//                    bill+="Extra Toppings Added: 120 \n";
//                    System.out.println("Done");
//                }

            }
            flag2 =  false;
        }

    }

    boolean flag3 = true;
    public void addTakeaway(){

        // your code goes here
        if(flag3){
            this.price+=20;

            flag3 = false;
        }


    }

    public String getBill(){
        // your code goes here
        if(isVeg)  bill="Base Price Of The Pizza: 300 \n";
        else  bill="Base Price Of The Pizza: 400 \n";

        if(!flag1){
            bill+="Extra Cheese Added: 80 \n" ;
        }

        if(!flag2){
            if(isVeg) bill+="Extra Toppings Added: 70 \n";
            else bill+="Extra Toppings Added: 120 \n";
        }

        if(!flag3) bill+="Paperbag Added: 20 \n";
        bill+="Total Price: "+ this.price + "\n";
        return bill;

    }
}
