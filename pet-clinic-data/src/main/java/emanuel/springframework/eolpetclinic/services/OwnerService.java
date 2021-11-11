package emanuel.springframework.eolpetclinic.services;

import emanuel.springframework.eolpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
