package edu.daslab.executable.java.operators;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import edu.daslab.executable.basic.model.BasicOperator;
import edu.daslab.executable.basic.model.FunctionModel;
import edu.daslab.executable.basic.model.ParamsModel;
import edu.daslab.executable.basic.model.ResultModel;

import java.util.List;
import java.util.stream.Stream;

/**
 * Java平台sort算子
 */
@Parameters(separators = "=")
public class SortOperator implements BasicOperator<Stream<List<String>>> {

    // 通过指定路径来获取代码的udf
    @Parameter(names={"--udfName"})
    String sortFunctionName;

    @Override
    public void execute(ParamsModel<Stream<List<String>>> inputArgs,
                        ResultModel<Stream<List<String>>> result) {
        SortOperator sortArgs = (SortOperator) inputArgs.getOperatorParam();
        FunctionModel sortFunction = inputArgs.getFunctionModel();
        assert sortFunction != null;
        Stream<List<String>> nextStream = result.getInnerResult()
                .sorted((data1, data2) -> (int) sortFunction.invoke(sortArgs.sortFunctionName, data1, data2));
        result.setInnerResult(nextStream);
    }
}