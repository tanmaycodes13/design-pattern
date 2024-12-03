package creational_design_pattern.prototype;

public class shape implements prototype{
    
    shape(){
        
    }

    @Override
    public prototype clone(){
        return new shape();
    }
}
