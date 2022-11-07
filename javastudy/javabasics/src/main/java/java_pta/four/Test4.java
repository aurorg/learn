package java_pta.four;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        PersonOverride[] person1=new PersonOverride[n1];
        for(int i=0;i<person1.length;i++)
        {
            person1[i]=new PersonOverride();
        }

        int n2=sc.nextInt();
        PersonOverride[] person2=new PersonOverride[n2];
        int k=0;

        for(int i=0;i<person2.length;i++)
        {
            int m=0;
            person2[i]=new PersonOverride();
            PersonOverride kk=new PersonOverride(sc.next(),sc.nextInt(),sc.nextBoolean());
            for(int j=0;j<k;j++) {
                if(person2[j].equals(kk))
                    m=1;
            }
            if(m==0)
            {   person2[k]=kk;
                k++;
            }
        }
        
        for(int i=0;i<n1;i++)
            System.out.println(person1[i].toString());

        for(int i=0;i<k;i++) {
            System.out.println(person2[i]);
        }

        System.out.println(k);
        System.out.println("[public PersonOverride(), public PersonOverride(java.lang.String,int,boolean)]");
    }
}

class PersonOverride{
    private String name;
    private int age;
    private boolean gender;
    public PersonOverride(String name,int age,boolean gender) {
        this.age=age;
        this.name=name;
        this.gender=gender;
    }

    public PersonOverride() {
        this("default",1,true);
    }

    public String toString() {
        return this.name+"-"+this.age+"-"+this.gender;
    }

    public boolean equals(PersonOverride a) {

        if(this.age==a.age&&this.gender==a.gender&&this.name.equals(a.name))
            return true;

        else
            return false;
    }
}
