package net.matmour.metier;

import net.matmour.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class IMetierImpl implements IMetier {
    @Autowired
    //@Qualifier("d2")
    private IDao dao;

    public IMetierImpl(){
    this.dao = dao;
}


    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*12 *Math.PI/2 *Math.cos(t);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
