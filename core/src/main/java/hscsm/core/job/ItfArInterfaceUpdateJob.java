package hscsm.core.job;

import com.hand.hap.job.AbstractJob;
import hscsm.core.itf.service.IItfArInterfaceService;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 每天定时更新job
 * @author xuwang01@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2018/03/15
 */
@DisallowConcurrentExecution
public class ItfArInterfaceUpdateJob extends AbstractJob {

    @Autowired
    IItfArInterfaceService iItfArInterfaceService;

    @Override
    public void safeExecute(JobExecutionContext context) throws Exception {
        iItfArInterfaceService.updateArInterface();
    }

    @Override
    public boolean isRefireImmediatelyWhenException() {
        return false;
    }

}
