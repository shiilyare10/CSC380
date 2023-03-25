public class Member{
  /* This Object holds the name, biography, parents, children and spouse of 
     a given member of the tree.
  */
  //Variables:
  String name;
  String bio;
  Member[] children; //an arraylist would work better.
  Member parentOne;
  Member parentTwo; // maybe we could combine these into an arraylist with a size limit of 2 ( pArray[1] )
  Member spouse;
  
  /* The methods of this class are the following:
      Get = fetches variable following the get section of the method's title. ( ex. getName fetches the name )
      Set = replaces a variable with a given input.
      Add = adds a value to a given variable. 
      Remove = removes (nulls?) a value from a variable.
      Clear = clears an array.
  */
  //Get:
  public String getName(){
    // return name;
  }
  public String getBio(){
    // return bio;
  }
  public Member getChildren(){
    // return the whole list of children? A single child? Which child?
  }
  public Member getParents(){
    // return a parent? which parent?
  }
  public Member getSpouse(){
    // return spouse;
  }
  //Set:
  public void setName( String iName ){
    // name = iName;
  }
  public void setBio( String iBio ){
    // bio = iBio;
  }
  public void setSpouse( Member iSpouse ){
    // spouse = iSpouse;
  }
  //Add:
  public void addChild( Member iChild ){
    // adds a child to the array of children Members.
  }
  public void addParent( Member iParent ){
    // adds a parent... to? parentOne? parentTwo?
  }
  //Remove:
  public void removeChild( Member iChild ){
    // removes a child from the array of the children Members.
  }
  public void removeParent( Member iParent ){
    // Check to make sure that parent exists.
    // Which parent? parentOne? parentTwo?
  //Clear:
  public void clearChildren(){
    // clear all of the children from the array
  }
  
