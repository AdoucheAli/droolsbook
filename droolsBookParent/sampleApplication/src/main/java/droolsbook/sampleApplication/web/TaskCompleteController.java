package droolsbook.sampleApplication.web;

import org.jbpm.task.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskCompleteController {

  @Autowired
  private TaskService localTaskService;

  @RequestMapping("/taskComplete.htm")
  public String taskComplete(Long taskId) {
    localTaskService.complete(taskId, "123", null);
    return "redirect:taskList.htm";
  }

}
