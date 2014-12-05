package net.opengis.swe.v20;


/**
 * POJO class for XML type QuantityRangeType(@http://www.opengis.net/swe/2.0).
 *
 * This is a complex type.
 */
@SuppressWarnings("javadoc")
public interface QuantityRange extends RangeComponent, HasUom, HasConstraints<AllowedValues>
{
    
    /**
     * Gets the value property
     */
    public double[] getValue();
    
    
    /**
     * Checks if value is set
     */
    public boolean isSetValue();
    
    
    /**
     * Sets the value property
     */
    public void setValue(double[] value);
}