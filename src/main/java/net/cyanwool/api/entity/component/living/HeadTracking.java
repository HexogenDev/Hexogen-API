package net.cyanwool.api.entity.component.living;

import net.cyanwool.api.entity.BaseEntity;
import net.cyanwool.api.entity.component.Component;
import net.cyanwool.api.world.Position;
import net.cyanwool.api.world.chunk.Chunk;

public interface HeadTracking extends Component {

	public boolean canSeeEntity(BaseEntity baseEntity);

	public boolean canSeeChunk(Chunk chunk);

	public boolean canSeePosition(Position position);
}
