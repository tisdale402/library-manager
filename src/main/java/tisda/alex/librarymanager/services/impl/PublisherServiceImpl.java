package tisda.alex.librarymanager.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tisda.alex.librarymanager.entities.Publisher;
import tisda.alex.librarymanager.exceptions.NotFoundException;
import tisda.alex.librarymanager.repositories.PublisherRepository;
import tisda.alex.librarymanager.services.PublisherService;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    @Override
    public List<Publisher> findAllPublishers() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher findPublisherById(Long id) {
        return publisherRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Publisher not found  with ID %d", id)));
    }

    @Override
    public void createPublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    @Override
    public void updatePublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    @Override
    public void deletePublisher(Long id) {
        final Publisher publisher = publisherRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Publisher not found  with ID %d", id)));

        publisherRepository.deleteById(publisher.getId());
    }}
