package treelinecalculationsalgorithm;

import java.util.ArrayList;

// Member Class
public class Member 
{
    private String name;                // First and Last Name of the Member
    private String biography;           // Holds extra information about the Member
    private ArrayList<Member> children; // List of Children that the Member has
    private int childCount;             // Count of children that the Member has
    private Member mother;              // First Parent of the Member
    private Member father;              // Second Parent of the Member
    private Member spouse;              // Spouse of the Member

    // Default Constructor
    public Member()
    {
        name       = "";
        biography  = "";
        children   = new ArrayList<>();
        childCount = 0;
        mother     = null;
        father     = null;
        spouse     = null;
    }

    // Constructor with a Name and Biography parameters
    public Member(String name, String biography)
    {
        this.name      = name;
        this.biography = biography;
        children       = new ArrayList<>();
        childCount     = 0;
        mother         = null;
        father         = null;
        spouse         = null;
    }

    // Get Member's Name
    public String getName()
    {
        return this.name;
    }

    // Set Member's Name
    public void setName(String newName)
    {
        this.name = newName;
    }

    // Get Member's Biography
    public String getBiography()
    {
        return this.biography;
    }

    // Set Member's Biography
    public void setBiography(String newBiography)
    {
        this.biography = newBiography;
    }

    // Adds a Child
    public void addChild(Member newChild)
    {
        this.children.add(childCount, newChild);
        childCount++;
    }

    // Removes a Child
    public void removeChild(Member targetChild)
    {
        for(int count = 0; count < childCount; count++)
        {
            if(children.get(count) == targetChild)
            {
                children.remove(count);
            }
        }
    }

    // Clears all Children
    public void clearChidren()
    {
        children.removeAll(children);
    }

    // Gets all Children
    public ArrayList<Member> getChildren()
    {
        return children;
    }

    // Adds a Parent
    public void addParent(Member newParent)
    {
        if(mother != null && father != null)
        {
            System.out.println("Can't add more Parents\n");
        }

        else
        {
            if(mother == null)
            {
                mother = newParent;
            }

            else
            {
                father = newParent;
            }
        }
    }

    // Removes a Parent
    public void removeParent(Member targetParent)
    {
        if(mother == targetParent)
        {
            mother = null;
        }

        else
        {
            father = null;
        }
    }

    // Gets both Parents
    public ArrayList<Member> getParents()
    {
        ArrayList<Member> parents = new ArrayList<>();

        parents.add(mother);
        parents.add(father);

        return parents;
    }

    // Adds a Spouse
    public void addSpouse(Member newSpouse)
    {
        spouse = newSpouse;
    }

    // Removes a Spouse
    public void removeSpouse()
    {
        spouse = null;
    }

    // Gets the Spouse
    public Member getSpouse()
    {
        return spouse;
    }
}
