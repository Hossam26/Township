package com.company; 
    public class player {
    private String name;
    private int level;
    private int experience;
    private int experience_to_pass;
    private int money;
    public static storage Storage= new storage();
    public static town Town;
     private int cash;
    

   

    
    public player(String name, int level, int experience, int experience_to_pass, int money,int cash) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.experience_to_pass = experience_to_pass;
        this.money = money;
        this.cash=cash;
        Storage=new storage();
        Town=new town();
    }

    public int getCash() {
        return cash;
    }

    

    public void setcash(int cash) {
        this.cash = cash;
    }

        public int getMoney() {
            return money;
        }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setMoney(int money) {
        this.money = money;
    }
     public void add_Money(int money) {
        this.money += money;
    }

        public void inc_experience(int experience_gained)
    {
    experience+=experience_gained;
        experience_to_pass+=experience_gained;
        check_pass_level();
    }

    public int getExperience_to_pass() {
        return experience_to_pass;
    }
public void check_pass_level(){
            if(experience_to_pass>100*level)
            {
                level++;
                money+=50*level;
                cash+=2*level;
                experience_to_pass=0;
                
            }
}
}
class storage{
public  product Product[]=new product[20];

    public storage() {
        Product[0]=new product("T-shirt",20,25,7,10);
        Product[1]=new product("wheat",10,10,6,2);
        Product[2]=new product("cotton",10,15,5,2);
        Product[3]=new product("Bread",20,25,0,10);
         Product[4]=new product("suger",15,20,0,4);
         Product[5]=new product("sugercane",10,15,0,12);
         Product[6]=new product("egg",10,15,0,12);

         Product[7]=new product("cookies",10,15,0,12);
         Product[8]=new product("brown suger",12,10,0,12);
         Product[9]=new product("flour_cake",16,15,0,12);
         
          
    }
   /* public void storage_dispaly()
    {
        for(int i=0;i<4;i++)
        {System.out.print("#"+(i+1)+"  ");Product[i].dispaly_product();}
    }*/
    public void sell(int i)
    {
        Product[i].sell();
    }
    public void buy(int i)
    {
        Product[i].buy();
    }
}
class product{
    private String name;
    private int price;
    private int cost;
    private int count;
    private int experience_given;

    public product(String name, int price, int cost, int count, int experience_given) {
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.count = count;
        this.experience_given = experience_given;
    }
    public void dispaly_product() {
        System.out.println(name + "  amount: " + count);
    }
    public void use(int num) {
        count-=num;
    }

    public int getExperience_given() {
        return experience_given;
    }

    public int getPrice() {
        return price;
    }

    public void increase(int num) {
        this.count += num;
    }

    public int sell()
    {
        count--;
        return price;
    }

    public int getCount() {
        return count;
    }
    
    public int buy()
    {
        count++;
        return cost;
    }
    void add(int times)
    {
        count+=times;
    }
    void used(int times)
    {
        count--;
    }
}
