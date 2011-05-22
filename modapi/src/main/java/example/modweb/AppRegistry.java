package example.modweb;

import example.modweb.api.ModuleProvider;
import java.util.HashMap;
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
    
    @Inject
    private Instance<ModuleProvider> moduleProviders;

    public AppRegistry() {
        System.out.println("Contruct AppRegistry: " + this);
    }
            
    @PostConstruct
    public void postConstruct() {
        System.out.println("moduleProviders: " + moduleProviders);
    }
    
}	
