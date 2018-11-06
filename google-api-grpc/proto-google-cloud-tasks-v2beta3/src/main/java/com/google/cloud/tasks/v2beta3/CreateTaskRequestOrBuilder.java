// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

package com.google.cloud.tasks.v2beta3;

public interface CreateTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta3.CreateTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * The queue name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   * The queue must already exist.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required.
   * The queue name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   * The queue must already exist.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required.
   * The task to add.
   * Task names have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
   * The user can optionally specify a task [name][google.cloud.tasks.v2beta3.Task.name]. If a
   * name is not specified then the system will generate a random
   * unique task id, which will be set in the task returned in the
   * [response][google.cloud.tasks.v2beta3.Task.name].
   * If [schedule_time][google.cloud.tasks.v2beta3.Task.schedule_time] is not set or is in the
   * past then Cloud Tasks will set it to the current time.
   * Task De-duplication:
   * Explicitly specifying a task ID enables task de-duplication.  If
   * a task's ID is identical to that of an existing task or a task
   * that was deleted or executed recently then the call will fail
   * with [ALREADY_EXISTS][google.rpc.Code.ALREADY_EXISTS].
   * If the task's queue was created using Cloud Tasks, then another task with
   * the same name can't be created for ~1hour after the original task was
   * deleted or executed. If the task's queue was created using queue.yaml or
   * queue.xml, then another task with the same name can't be created
   * for ~9days after the original task was deleted or executed.
   * Because there is an extra lookup cost to identify duplicate task
   * names, these [CreateTask][google.cloud.tasks.v2beta3.CloudTasks.CreateTask] calls have significantly
   * increased latency. Using hashed strings for the task id or for
   * the prefix of the task id is recommended. Choosing task ids that
   * are sequential or have sequential prefixes, for example using a
   * timestamp, causes an increase in latency and error rates in all
   * task commands. The infrastructure relies on an approximately
   * uniform distribution of task ids to store and serve tasks
   * efficiently.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Task task = 2;</code>
   */
  boolean hasTask();
  /**
   * <pre>
   * Required.
   * The task to add.
   * Task names have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
   * The user can optionally specify a task [name][google.cloud.tasks.v2beta3.Task.name]. If a
   * name is not specified then the system will generate a random
   * unique task id, which will be set in the task returned in the
   * [response][google.cloud.tasks.v2beta3.Task.name].
   * If [schedule_time][google.cloud.tasks.v2beta3.Task.schedule_time] is not set or is in the
   * past then Cloud Tasks will set it to the current time.
   * Task De-duplication:
   * Explicitly specifying a task ID enables task de-duplication.  If
   * a task's ID is identical to that of an existing task or a task
   * that was deleted or executed recently then the call will fail
   * with [ALREADY_EXISTS][google.rpc.Code.ALREADY_EXISTS].
   * If the task's queue was created using Cloud Tasks, then another task with
   * the same name can't be created for ~1hour after the original task was
   * deleted or executed. If the task's queue was created using queue.yaml or
   * queue.xml, then another task with the same name can't be created
   * for ~9days after the original task was deleted or executed.
   * Because there is an extra lookup cost to identify duplicate task
   * names, these [CreateTask][google.cloud.tasks.v2beta3.CloudTasks.CreateTask] calls have significantly
   * increased latency. Using hashed strings for the task id or for
   * the prefix of the task id is recommended. Choosing task ids that
   * are sequential or have sequential prefixes, for example using a
   * timestamp, causes an increase in latency and error rates in all
   * task commands. The infrastructure relies on an approximately
   * uniform distribution of task ids to store and serve tasks
   * efficiently.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Task task = 2;</code>
   */
  com.google.cloud.tasks.v2beta3.Task getTask();
  /**
   * <pre>
   * Required.
   * The task to add.
   * Task names have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
   * The user can optionally specify a task [name][google.cloud.tasks.v2beta3.Task.name]. If a
   * name is not specified then the system will generate a random
   * unique task id, which will be set in the task returned in the
   * [response][google.cloud.tasks.v2beta3.Task.name].
   * If [schedule_time][google.cloud.tasks.v2beta3.Task.schedule_time] is not set or is in the
   * past then Cloud Tasks will set it to the current time.
   * Task De-duplication:
   * Explicitly specifying a task ID enables task de-duplication.  If
   * a task's ID is identical to that of an existing task or a task
   * that was deleted or executed recently then the call will fail
   * with [ALREADY_EXISTS][google.rpc.Code.ALREADY_EXISTS].
   * If the task's queue was created using Cloud Tasks, then another task with
   * the same name can't be created for ~1hour after the original task was
   * deleted or executed. If the task's queue was created using queue.yaml or
   * queue.xml, then another task with the same name can't be created
   * for ~9days after the original task was deleted or executed.
   * Because there is an extra lookup cost to identify duplicate task
   * names, these [CreateTask][google.cloud.tasks.v2beta3.CloudTasks.CreateTask] calls have significantly
   * increased latency. Using hashed strings for the task id or for
   * the prefix of the task id is recommended. Choosing task ids that
   * are sequential or have sequential prefixes, for example using a
   * timestamp, causes an increase in latency and error rates in all
   * task commands. The infrastructure relies on an approximately
   * uniform distribution of task ids to store and serve tasks
   * efficiently.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Task task = 2;</code>
   */
  com.google.cloud.tasks.v2beta3.TaskOrBuilder getTaskOrBuilder();

  /**
   * <pre>
   * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta3.Task] will be
   * returned.
   * By default response_view is [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all
   * information is retrieved by default because some data, such as
   * payloads, might be desirable to return only when needed because
   * of its large size or because of the sensitivity of data that it
   * contains.
   * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL] requires
   * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
   * permission on the [Task][google.cloud.tasks.v2beta3.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 3;</code>
   */
  int getResponseViewValue();
  /**
   * <pre>
   * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta3.Task] will be
   * returned.
   * By default response_view is [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all
   * information is retrieved by default because some data, such as
   * payloads, might be desirable to return only when needed because
   * of its large size or because of the sensitivity of data that it
   * contains.
   * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL] requires
   * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
   * permission on the [Task][google.cloud.tasks.v2beta3.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 3;</code>
   */
  com.google.cloud.tasks.v2beta3.Task.View getResponseView();
}
