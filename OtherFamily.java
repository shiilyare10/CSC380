package treelinecalculationsalgorithm;

import java.util.HashSet;
import java.util.Iterator;

// Family Class
public class Family
{
    HashSet<Member> FamilyMembers; // List of Members in the Family
    Member root;                   // First Member added to the Family

    // Default Constructor
    public Family()
    {
        FamilyMembers = new HashSet<>();
        root = null;
    }

    // Adds a Member to the Tree
    public void addMember(Member newMember)
    {
        FamilyMembers.add(newMember);

        if(FamilyMembers.size() == 1)
        {
            root = newMember;
        }
    }

    // Removes a Member from the Tree
    public void removeMember(Member targetMember)
    {
        if(FamilyMembers.contains(targetMember))
        {
            FamilyMembers.remove(targetMember);
        }
    }
              
    // Clears all Members in the Tree
    public void clearMembers()
    {
        FamilyMembers.clear();
    }

    // Returns the desired Member from the Tree
    public Member accessMember(Member targetMember)
    {
        if(FamilyMembers.contains(targetMember))
        {
            for(Member member : FamilyMembers)
            {
                if(member.equals(targetMember))
                {
                    return member;
                }
            }
        }

        return null;
    }
}
