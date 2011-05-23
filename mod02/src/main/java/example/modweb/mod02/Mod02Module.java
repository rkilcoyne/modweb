package example.modweb.mod02;

import example.modweb.api.ModuleProvider;

public class Mod02Module implements ModuleProvider {

    @Override
    public String getName() {
        return "Module 02";
    }

    @Override
    public String getId() {
        return "example.modweb.mod02";
    }

    @Override
    public String getDescription() {
        return "Module 02 provides functionality B.";
    }

    @Override
    public String getDefaultAction() {
        return "/mod02.jsf";
    }
    
}
