import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import weka.classifiers.Evaluation;
import weka.classifiers.evaluation.output.prediction.PlainText;
import weka.classifiers.lazy.KStar;
import weka.core.Instances;
import weka.classifiers.Classifier;
import weka.core.Instances;

public class test {
	

public static void main(String[] args) throws Exception
	    {
	try {
        Instances insts = new Instances(new BufferedReader(new FileReader(args[0])));

        insts.setClassIndex(insts.numAttributes() - 1);
        Evaluation eval = new Evaluation(insts);
        StringBuffer predsBuffer = new StringBuffer();
        PlainText plainText = new PlainText();
        plainText.setHeader(insts);
        plainText.setBuffer(predsBuffer);

        KStar j = new KStar();
        j.buildClassifier(insts);
        eval.evaluateModel(j,insts,plainText);
        System.out.println(predsBuffer.toString());
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
	    }


