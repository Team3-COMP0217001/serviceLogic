package Entity;

/*
 * COMP217: Java Programming / Team 03
 * Prof: Suh, Young-Kyoon
 *
 * Administrator: class which have methods that only can be used by Administrator. (this class is inherited "Member" abstract class.)
 * @author: Seo, HyeongCheol
 */
public class Administrator extends abs_Member {
    public Administrator(){
        super();
    }
    public Administrator(String name, int year, int month, int day, String email){
        super(name, year, month, day, email);
    }
    public Administrator(abs_Member obj){
        super(obj);
    }
}

