package robust.gradle.plugin.asm;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hedingxu on 17/8/22.
 */

public class ShouldInsertCodeMethod {
    private ShouldInsertCodeMethod(){

    }
    //由于class name会被混淆，这里不判断class name了
    private final static List<String> SHOULD_INSERT_CODE_METHODS = Arrays.asList(
            //View.OnClickListener
            "onClick"

            //Activity
            ,"onCreate","onStart","onRestart","onStop","onResume","onPause","onDestroy"

            //Fragment
            ,"onCreate","onViewCreated","onActivityCreated", "onStart","onResume","onStop","onDestroy","onDetach"
    );

    public static boolean isNeedInsertCode(String methodName){
        return SHOULD_INSERT_CODE_METHODS.contains(methodName);
    }
}