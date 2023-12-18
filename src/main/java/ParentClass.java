// Java program to illustrate
// Overriding only hashCode() method

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Geek
{
    String name;
    int id;

    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode()
    {

        // We are returning the Geek_id
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
        return 1;

        //here we have returned 1 so when we pass
    }

    public static int hash(Object... values) {
        return Arrays.hashCode(values);
    }


}

class GFG
{
    public static void main (String[] args)
    {

        // creating two Objects with
        // same state
        Geek g1 = new Geek("aditya", 1);
        Geek g2 = new Geek("aditya", 1);

        Map<Geek, String> map = new HashMap<Geek, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");

        for(Geek geek : map.keySet())
        {
            System.out.println(map.get(geek).toString());
        }

    }
}
