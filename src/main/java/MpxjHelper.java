import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Resource;
import net.sf.mpxj.mpp.MPPReader;
import net.sf.mpxj.reader.ProjectReader;

/**
 * Created by Gilney on 22/03/2015.
 */
public class MpxjHelper {

    public void retornaUm (String arquivoProject) throws MPXJException {

        ProjectReader reader = new MPPReader();
        ProjectFile project = reader.read("C:\\Projetos\\Project\\testResources\\Project1.mpp");
        for (Resource resource : project.getAllResources())
        {
            System.out.println("Resource: " + resource.getName() + " (Unique ID=" + resource.getUniqueID() + ")");
        }


    }
}
