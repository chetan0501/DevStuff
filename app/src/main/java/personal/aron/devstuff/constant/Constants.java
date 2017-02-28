package personal.aron.devstuff.constant;

import java.util.ArrayList;

import personal.aron.devstuff.R;
import personal.aron.devstuff.dto.Module;

/**
 * Created by a596771 on 28-02-2017.
 */

public interface Constants {

    Module moduleMaps = new Module("Maps", "Google map integrations with geofencing & more...", "", "http://3.bp.blogspot.com/_ZaGO7GjCqAI/Rh47v0ZvaoI/AAAAAAAABjA/20hcUi_0XVo/s640/maps-building-layer.png");
    Module moduleAnimations = new Module("Animations", "Animation is fun...", "", "https://s3.amazonaws.com/university-prod/uploads/attachments/354/original/motion.png?1444883111");

    public Module[] moduleList = {moduleMaps,moduleAnimations};

    public int numColumnsGridHome = 2;

}
