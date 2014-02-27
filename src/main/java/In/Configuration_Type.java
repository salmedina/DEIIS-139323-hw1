
/* First created by JCasGen Thu Feb 27 02:41:05 CST 2014 */
package In;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The parameters to configure the CAS:
1) N-Gram size

 * Updated by JCasGen Thu Feb 27 02:41:05 CST 2014
 * @generated */
public class Configuration_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Configuration_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Configuration_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Configuration(addr, Configuration_Type.this);
  			   Configuration_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Configuration(addr, Configuration_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Configuration.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("In.Configuration");
 
  /** @generated */
  final Feature casFeat_NGramSize;
  /** @generated */
  final int     casFeatCode_NGramSize;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNGramSize(int addr) {
        if (featOkTst && casFeat_NGramSize == null)
      jcas.throwFeatMissing("NGramSize", "In.Configuration");
    return ll_cas.ll_getIntValue(addr, casFeatCode_NGramSize);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNGramSize(int addr, int v) {
        if (featOkTst && casFeat_NGramSize == null)
      jcas.throwFeatMissing("NGramSize", "In.Configuration");
    ll_cas.ll_setIntValue(addr, casFeatCode_NGramSize, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Configuration_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_NGramSize = jcas.getRequiredFeatureDE(casType, "NGramSize", "uima.cas.Integer", featOkTst);
    casFeatCode_NGramSize  = (null == casFeat_NGramSize) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NGramSize).getCode();

  }
}



    