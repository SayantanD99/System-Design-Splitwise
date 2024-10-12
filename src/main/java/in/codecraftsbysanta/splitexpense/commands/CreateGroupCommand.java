package in.codecraftsbysanta.splitexpense.commands;

import in.codecraftsbysanta.splitexpense.controllers.GroupController;
import in.codecraftsbysanta.splitexpense.dtos.CreateGroupRequest;
import in.codecraftsbysanta.splitexpense.models.Group;
import in.codecraftsbysanta.splitexpense.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

// Step 2 - Create the concrete command classes
@Component
@AllArgsConstructor
public class CreateGroupCommand implements Command {

    private GroupController groupController;

    @Override
    public boolean matches(String input) {
        String command = Command.getCommand(input);
        if (!command.equals(Commands.CREATE_GROUP_COMMAND)) {
            return false;
        }

        return true;
    }


    @Override
    public void execute(String input) {
        System.out.println("Executing create group command");
        List<String> tokens = Command.getTokens(input);
        List<Long> memberIds = Arrays.stream(tokens.get(3).split(","))
                .map(Long::valueOf)
                .toList();
        CreateGroupRequest request = CreateGroupRequest.builder()
                .name(tokens.get(1))
                .createdBy(Long.valueOf(tokens.get(2)))
                .memberIds(memberIds)
                .build();

        Group group = groupController.createGroup(request);
        System.out.println("Created group with id: " + group.getId());
    }
}