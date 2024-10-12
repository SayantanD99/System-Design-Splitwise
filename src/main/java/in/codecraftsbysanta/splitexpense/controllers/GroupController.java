package in.codecraftsbysanta.splitexpense.controllers;

import in.codecraftsbysanta.splitexpense.dtos.CreateGroupRequest;
import in.codecraftsbysanta.splitexpense.models.Group;
import in.codecraftsbysanta.splitexpense.models.User;
import in.codecraftsbysanta.splitexpense.services.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class GroupController {
    private GroupService groupService;
    public Group createGroup(CreateGroupRequest request) {
        return groupService.createGroup(request);
    }
}
