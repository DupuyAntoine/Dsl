package dsl.aspects;

import dsl.FSM;
import dsl.aspects.FSMAspectFSMAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FSMAspectFSMAspectContext {
  public final static FSMAspectFSMAspectContext INSTANCE = new FSMAspectFSMAspectContext();
  
  public static FSMAspectFSMAspectProperties getSelf(final FSM _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new dsl.aspects.FSMAspectFSMAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FSM, FSMAspectFSMAspectProperties> map = new java.util.WeakHashMap<dsl.FSM, dsl.aspects.FSMAspectFSMAspectProperties>();
  
  public Map<FSM, FSMAspectFSMAspectProperties> getMap() {
    return map;
  }
}
