package PearsonChapter11.Assignment1;

//************************************
//    Name: Ronald Rajski
//    Classs: COSC 1174-48L
//    Assignment: Minecraft Blocks
//    Date: 9/5/2021
//
//************************************
//
//**************************************************************************************
//* UML                                                                                *
//        ******************************************************************************
//* Block                                                                              *
//
//        -blockID:         int                                                        *
//        -blockName:   String                                                         *
//        -toolNeeded:   boolean                                                       *
//        -hardness:        int                                                        *
//        -itemDrop:      String                                                       *
//        ******************************************************************************
//        +Block()                                                                     *
//        +Block(blockID: int, blockName: String, toolNeeded: boolean, hardness: int)  *
//        +setHardness(int): void                                                      *
//        +getHardness(): int                                                          *
//        +isDestroyed(): String                                                       *
//        ******************************************************************************



//This represents a MineCraft Block
//This is the super for all block types in the game.
public class Block {

    //    id of the block
    int blockId;

    //    name of the block
    String blockName;

    //    is tool needed to destroy the block and cause an item to drop
    boolean toolNeeded;

//    determines the level of hardness of the block

    int hardness;

//    item that drops upon destruction of the block

    String itemDrop;

    //    Creates a block with default values-Default constructor
    public Block() {

    }

    ////    Creates a constructor with 4 parameters passed to the constructor.
//    int blockId -  sets the id of the block
//    String blockName  sets the name of the block
//    boolean toolNeeded sets whether or not a tool is needed to destroy the block
//    hardness sets the hardness level of the block
    public Block(int blockId, String blockName, boolean toolNeeded, int hardness) {
        this.blockId = blockId;
        this.blockName = blockName;
        this.toolNeeded = toolNeeded;
        setHardness(hardness);
    }

    //    Getter for the block's hardness
//    returns the remaining hardness of the block
    public int getHardness() {
        return hardness;
    }


    //    Setter for the block's hardness
//    Sets the hardness to an integer value
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


}




