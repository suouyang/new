package com.gaotong.smart.gaotong.servicebase.config.exception;//package com.gaotong.servicebase.config.exception;
//
//
//import com.gaotong.smart.Result;
//import lombok.extern.slf4j.Slf4j;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import java.io.IOException;
//
//@Slf4j
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public Result error(Exception e){
//        e.printStackTrace();
//        return Result.error().mesage("");
//    }
//    // 捕捉shiro的异常
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ExceptionHandler(ShiroException.class)
//    public Result handle401(ShiroException e) {
//        return Result.error().code(401).mesage(e.getMessage());
//    }
//
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(value = IllegalArgumentException.class)
//    public Result handler(IllegalArgumentException e) throws IOException {
//       log.error("Assert异常:-------------->{}",e.getMessage());
//        return Result.error().mesage(e.getMessage());
//    }
//    /**
//     * @Validated 校验错误异常处理
//     */
////    @ResponseStatus(HttpStatus.BAD_REQUEST)
////    @ExceptionHandler(value = MethodArgumentNotValidException.class)
////    public Result handler(MethodArgumentNotValidException e) throws IOException {
////        log.error("运行时异常:-------------->",e);
////        BindingResult bindingResult = e.getBindingResult();
////        ObjectError objectError = bindingResult.getAllErrors().stream().findFirst().get();
////        return Result.error().mesage(objectError.getDefaultMessage());
////    }
//
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(value = RuntimeException.class)
//    public Result handler(RuntimeException e) throws IOException {
//        log.error("运行时异常:-------------->",e);
//        return Result.error().mesage(e.getMessage());
//    }
//
//
//
//
//
//
//}
