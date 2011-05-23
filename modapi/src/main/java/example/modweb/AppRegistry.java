package example.modweb;

import example.modweb.api.ModuleProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@Singleton
@ApplicationScoped
public class AppRegistry {

    private Map<String, ModuleProvider> modules = new HashMap<String, ModuleProvider>();
    
    @PostConstruct @Inject 
    public void postConstruct(Instance<ModuleProvider> moduleProviders) {
        for (ModuleProvider provider: moduleProviders) {
            modules.put(provider.getId(), provider);
        }
    }
    
    public List<ModuleProvider> getModules() {
        return new ArrayList<ModuleProvider>(modules.values());
    }
    
}	
