package com.curtisnewbie.api;

/**
 * <p>
 * A handler for {@link Task}
 * </p>
 *
 * @author zhuangyongj
 */
public interface TaskHandler {

    /**
     * Handle {@code Task} without the ability to get the completed result
     */
   void asyncHandle(Task<?> t);
}
