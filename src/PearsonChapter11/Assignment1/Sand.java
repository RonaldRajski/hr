package PearsonChapter11.Assignment1;


//************************************
//    Name: Ronald Rajski
//    Classs: COSC 1174-48L
//    Assignment: Minecraft Blocks
//    Date: 9/5/2021
//
//************************************


//**************************************************************************************
//* UML                                                                                *
//        ******************************************************************************
//* Block: Sand                                                                             *
//
//        -blockID:         55                                                         *
//        -blockName:   Sand                                                           *
//        -toolNeeded:   true                                                          *
//        -hardness:        2                                                          *
//        -itemDrop:      sand                                                         *
//        ******************************************************************************
//        +Sand()                                                                     *
//        +Block(blockID: int, blockName: String, toolNeeded: boolean, hardness: int)  *
//        +setHardness(int): void                                                      *
//        +getHardness(): int                                                          *
//        +isDestroyed(): String                                                       *
//        ******************************************************************************



//        Next, create 2 constructors for sand, 1 default, and 1 that takes in all 5 data fields. (note: both constructors should set the data fields to the same values, as sand must have these values to be sand)
//        Now override all the methods inherited from Block. For isDestroyed, you should invoke getHardness(), and if it is less than 1, return the itemDrop (we won’t worry about actually destroying the block in this class)




//Representative of a Sand Block - extend causes Sand to inherit from the Block class
public class Sand extends Block{

//    ID of the Block
    int blockId;
//    Name of the Block
    String blockName;
//    Whether tool is needed to cause an item to drop
    boolean toolNeeded;
//    hardness of the block
    int hardness;
//    Item that will drop if block is destroyed
    String itemDrop;

//    Makes a new Sand Block with Default values-Constructor 1
    public Sand(){
        super(55, "sand", true, 2);
        this.blockId = super.blockId;
        this.blockName = super.blockName;
        this.toolNeeded = super.toolNeeded;
        this.itemDrop = "sand";
    }
    public Sand(int blockId, String blockName, boolean toolNeeded, int hardness, String itemDrop){
        this.blockId = blockId;
        this.blockName= blockName;
        this.toolNeeded= toolNeeded;
        this.hardness = hardness;
        this.itemDrop = itemDrop;
    }

//    getters and setters

//    Getter for hardness level.
//    return for remaining hardness level
    @Override
    public int getHardness() {
        return hardness;
    }

//    Sets hardness level to integer value
    @Override
    public void setHardness(int hardness) {
        this.hardness = hardness;
    }
    //    Determines if block was destroyed
//    returns a string indicating whether or not the block was destroyed

    public String isDestroyed() {
//        hardness value returned by getHardness
        int thisHardness = getHardness();

        ////        What is dropped when itmem is isDestroyed
        String dropped;

        if(thisHardness <= 0) {
            if(this.itemDrop != null) {
                dropped = this.itemDrop;
            } else {
                dropped = "nothing";
            }
        }
        else{
            dropped = "nothing";
        }

        return dropped;
    }
    public String toString() {
        return "\n\nSand <<Block>> {" + "\n\n" +
                "  blockId: " + blockId + "\n\n" +
                "  blockName: " + blockName + "\n\n" +
                "  toolNeeded: " + toolNeeded + "\n\n" +
                "  hardness: " + hardness + "\n\n" +
                "  itemDrop: " + itemDrop + "\n\n" +
                "}\n\n";
    }


}
