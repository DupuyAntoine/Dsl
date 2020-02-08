package dsl.aspects;

import dsl.DslPackage;
import dsl.FSM;
import dsl.aspects.FSMAspect;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class Interpreter {
  public static void main(final String[] args) {
    DslPackage.eINSTANCE.getClass();
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    Resource resource = new ResourceSetImpl().getResource(URI.createURI("\\Users\\AdminEtu\\Desktop\\Antoine\\workspace_gemoc\\dsl\\model\\FSM.xmi"), true);
    EObject _get = resource.getContents().get(0);
    FSM myfsm = ((FSM) _get);
    FSMAspect.interprete(myfsm);
  }
}
